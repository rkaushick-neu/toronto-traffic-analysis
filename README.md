# Toronto Traffic Analysis in Hadoop

## Data Description
| Sr. No | Column                                           | Datatype       | Description                                                                                           |
|--------|--------------------------------------------------|----------------|-------------------------------------------------------------------------------------------------------|
| 1      | _id                                              | Integer        | Primary Key column.                                                                                   |
| 2      | count_id                                         | Integer        |                                                                                                       |
| 3      | count_date                                       | Date           | Date column.                                                                                          |
| 4      | location_id                                      | Integer        | Foreign key based on locations.                                                                       |
| 5      | location                                         | String         | Name of the street intersection.                                                                      |
| 6      | lng                                              | Double         | Longitude value.                                                                                      |
| 7      | lat                                              | Double         | Latitude value.                                                                                       |
| 8      | centreline_type                                  | Integer        | Not used in the project.                                                                              |
| 9      | centreline_id                                    | Integer        | Not used in the project.                                                                              |
| 10     | px                                               | Integer        | Not used in the project.                                                                              |
| 11     | time_start                                       | LocalDateTime  | Data collection start time.                                                                           |
| 12     | time_end                                         | LocalDateTime  | Data collection end time. Data was collected every 15 minutes – so end time is 15 minutes after the start time. |
| 13-60  | sb_cars_r, sb_cars_t, sb_cars_l,                | Integer        | Format: `<direction_vehicle-type_lane>`                                                              |
|        | nb_cars_r, nb_cars_t, nb_cars_l,                |                | **Directions:**                                                                                      |
|        | wb_cars_r, wb_cars_t, wb_cars_l,                |                | - `sb`: southbound                                                                                   |
|        | eb_cars_r, eb_cars_t, eb_cars_l,                |                | - `nb`: northbound                                                                                   |
|        | sb_truck_r, sb_truck_t, sb_truck_l,             |                | - `eb`: eastbound                                                                                    |
|        | nb_truck_r, nb_truck_t, nb_truck_l,             |                | - `wb`: westbound                                                                                    |
|        | wb_truck_r, wb_truck_t, wb_truck_l,             |                | **Vehicle Types:**                                                                                   |
|        | eb_truck_r, eb_truck_t, eb_truck_l,             |                | - `cars`                                                                                            |
|        | sb_bus_r, sb_bus_t, sb_bus_l,                   |                | - `trucks`                                                                                           |
|        | nb_bus_r, nb_bus_t, nb_bus_l,                   |                | - `buses`                                                                                            |
|        | wb_bus_r, wb_bus_t, wb_bus_l,                   |                | - `pedestrians`                                                                                      |
|        | eb_bus_r, eb_bus_t, eb_bus_l,                   |                | - `bikes`                                                                                            |
|        | nx_bike, sx_bike, ex_bike, wx_bike,             |                | - `others`                                                                                           |
|        | nx_other, sx_other, ex_other, wx_other          |                | **Lane:**                                                                                            |
|        |                                                 |                | - `l`: turning left                                                                                  |
|        |                                                 |                | - `t`: going straight (thru)                                                                         |
|        |                                                 |                | - `r`: turning right                                                                                 |