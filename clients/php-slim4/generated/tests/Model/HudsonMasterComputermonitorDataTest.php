<?php

/**
 * Swaggy Jenkins
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Jenkins API clients generated from Swagger / Open API specification
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\HudsonMasterComputermonitorData;

/**
 * HudsonMasterComputermonitorDataTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\HudsonMasterComputermonitorData
 */
class HudsonMasterComputermonitorDataTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test "HudsonMasterComputermonitorData"
     */
    public function testHudsonMasterComputermonitorData()
    {
        $testHudsonMasterComputermonitorData = new HudsonMasterComputermonitorData();
        $namespacedClassname = HudsonMasterComputermonitorData::getModelsNamespace() . '\\HudsonMasterComputermonitorData';
        $this->assertSame('\\' . HudsonMasterComputermonitorData::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "HudsonMasterComputermonitorData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hudsonNodeMonitorsSwapSpaceMonitor"
     */
    public function testPropertyHudsonNodeMonitorsSwapSpaceMonitor()
    {
        $this->markTestIncomplete(
            'Test of "hudsonNodeMonitorsSwapSpaceMonitor" property in "HudsonMasterComputermonitorData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hudsonNodeMonitorsTemporarySpaceMonitor"
     */
    public function testPropertyHudsonNodeMonitorsTemporarySpaceMonitor()
    {
        $this->markTestIncomplete(
            'Test of "hudsonNodeMonitorsTemporarySpaceMonitor" property in "HudsonMasterComputermonitorData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hudsonNodeMonitorsDiskSpaceMonitor"
     */
    public function testPropertyHudsonNodeMonitorsDiskSpaceMonitor()
    {
        $this->markTestIncomplete(
            'Test of "hudsonNodeMonitorsDiskSpaceMonitor" property in "HudsonMasterComputermonitorData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hudsonNodeMonitorsArchitectureMonitor"
     */
    public function testPropertyHudsonNodeMonitorsArchitectureMonitor()
    {
        $this->markTestIncomplete(
            'Test of "hudsonNodeMonitorsArchitectureMonitor" property in "HudsonMasterComputermonitorData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hudsonNodeMonitorsResponseTimeMonitor"
     */
    public function testPropertyHudsonNodeMonitorsResponseTimeMonitor()
    {
        $this->markTestIncomplete(
            'Test of "hudsonNodeMonitorsResponseTimeMonitor" property in "HudsonMasterComputermonitorData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hudsonNodeMonitorsClockMonitor"
     */
    public function testPropertyHudsonNodeMonitorsClockMonitor()
    {
        $this->markTestIncomplete(
            'Test of "hudsonNodeMonitorsClockMonitor" property in "HudsonMasterComputermonitorData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "class"
     */
    public function testPropertyClass()
    {
        $this->markTestIncomplete(
            'Test of "class" property in "HudsonMasterComputermonitorData" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = HudsonMasterComputermonitorData::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
