
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {

  @JsonIgnore
    private String id;
  @NotNull
    private String restaurantId;
  @NotNull
    private String name;
  @NotNull
    private String city;
  @NotNull
    private String imageUrl;
  @NotNull
    private Double latitude;
  @NotNull
    private Double longitude;
  @NotNull
    private String opensAt;
  @NotNull
    private String closesAt;
  @NotNull
    private List<String> attributes;
}
