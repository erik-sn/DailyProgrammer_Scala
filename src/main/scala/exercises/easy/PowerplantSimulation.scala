package exercises.easy

/**
      * Description:
    A powerplant for the city of Redmond goes offline every third day because of local demands. Ontop of this, the powerplant
    has to go offline for maintenance every 100 days. Keeping things complicated, on every 14th day, the powerplant is turned
    off for refueling. Your goal is to write a function which returns the number of days the powerplant is operational given
    a number of days to simulate.
    Formal Inputs & Outputs:
    Input Description:
    Integer days - the number of days we want to simulate the powerplant
    Output Description:
    Return the number of days the powerplant is operational.
    Sample Inputs & Outputs:
    The function, given 10, should return 7 (3 days removed because of maintenance every third day).
  */
class PowerplantSimulation {

  def daysInActive(days: Int, inactive: Int = 0): Int = {
    if(days == 0) inactive
    else if(days % 100 == 0 || days % 14 == 0 || days % 3 == 0)  daysInActive(days - 1, inactive + 1)
    else daysInActive(days -1, inactive)
  }

}
