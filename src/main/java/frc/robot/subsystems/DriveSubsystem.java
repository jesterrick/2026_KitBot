// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.CanIdConstants;
import frc.robot.constants.Constants;
import frc.robot.constants.DriveConstants;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  private final SparkMax m_LeftLeader;
  private final SparkMax m_LeftFollow;
  private final SparkMax m_RightLeader;
  private final SparkMax m_RightFollow;

  public DriveSubsystem()
  {
    this.m_LeftLeader = new SparkMax(CanIdConstants.kLeftMotorLeaderCanId, MotorType.kBrushed);
    this.m_LeftFollow = new SparkMax(CanIdConstants.kLeftMotorFollowCanId, MotorType.kBrushed);
    this.m_RightLeader = new SparkMax(CanIdConstants.kRightMotorLeaderCanId, MotorType.kBrushed);
    this.m_RightFollow = new SparkMax(CanIdConstants.kRightMotorFollowCanId, MotorType.kBrushed);

    SparkMaxConfig leftLeaderConf = new SparkMaxConfig();
    SparkMaxConfig leftFollowConf = new SparkMaxConfig();
    SparkMaxConfig rightLeaderConf = new SparkMaxConfig();
    SparkMaxConfig rightFollowConf = new SparkMaxConfig();

    leftLeaderConf.inverted(true);
    leftFollowConf.follow(this.m_LeftLeader, true);
    rightLeaderConf.inverted(false);
    rightFollowConf.follow(this.m_RightLeader, true);

    this.m_LeftLeader.configure(leftFollowConf, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    this.m_RightLeader.configure(rightFollowConf, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

  }

 


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
