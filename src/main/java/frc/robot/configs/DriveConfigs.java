// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.configs;

import com.revrobotics.spark.config.SparkMaxConfig;

import frc.robot.constants.CanIdConstants;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class DriveConfigs {
  /** Creates a new DriveConfigs. */

    public static final SparkMaxConfig m_LeftLeader = new SparkMaxConfig();
    public static final SparkMaxConfig m_LeftFollow = new SparkMaxConfig();

    static {
      m_LeftFollow.follow(CanIdConstants.kLeftMotorLeaderCanId, true);
      
    }
}
