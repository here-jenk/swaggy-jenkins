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
use OpenAPIServer\Model\Hudson;

/**
 * HudsonTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Hudson
 */
class HudsonTest extends TestCase
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
     * Test "Hudson"
     */
    public function testHudson()
    {
        $testHudson = new Hudson();
        $namespacedClassname = Hudson::getModelsNamespace() . '\\Hudson';
        $this->assertSame('\\' . Hudson::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "class"
     */
    public function testPropertyClass()
    {
        $this->markTestIncomplete(
            'Test of "class" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "assignedLabels"
     */
    public function testPropertyAssignedLabels()
    {
        $this->markTestIncomplete(
            'Test of "assignedLabels" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "mode"
     */
    public function testPropertyMode()
    {
        $this->markTestIncomplete(
            'Test of "mode" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "nodeDescription"
     */
    public function testPropertyNodeDescription()
    {
        $this->markTestIncomplete(
            'Test of "nodeDescription" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "nodeName"
     */
    public function testPropertyNodeName()
    {
        $this->markTestIncomplete(
            'Test of "nodeName" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "numExecutors"
     */
    public function testPropertyNumExecutors()
    {
        $this->markTestIncomplete(
            'Test of "numExecutors" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "description"
     */
    public function testPropertyDescription()
    {
        $this->markTestIncomplete(
            'Test of "description" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "jobs"
     */
    public function testPropertyJobs()
    {
        $this->markTestIncomplete(
            'Test of "jobs" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "primaryView"
     */
    public function testPropertyPrimaryView()
    {
        $this->markTestIncomplete(
            'Test of "primaryView" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "quietingDown"
     */
    public function testPropertyQuietingDown()
    {
        $this->markTestIncomplete(
            'Test of "quietingDown" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "slaveAgentPort"
     */
    public function testPropertySlaveAgentPort()
    {
        $this->markTestIncomplete(
            'Test of "slaveAgentPort" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "unlabeledLoad"
     */
    public function testPropertyUnlabeledLoad()
    {
        $this->markTestIncomplete(
            'Test of "unlabeledLoad" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "useCrumbs"
     */
    public function testPropertyUseCrumbs()
    {
        $this->markTestIncomplete(
            'Test of "useCrumbs" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "useSecurity"
     */
    public function testPropertyUseSecurity()
    {
        $this->markTestIncomplete(
            'Test of "useSecurity" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "views"
     */
    public function testPropertyViews()
    {
        $this->markTestIncomplete(
            'Test of "views" property in "Hudson" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Hudson::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
