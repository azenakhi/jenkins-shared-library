#!/usr/bin/env groovy

def call(String buildStatus = 'STARTED') {
  // build status of null means successful
  buildStatus = buildStatus ?: 'SUCCESS'

  // Default values
  def colorName = 'RED'
}
