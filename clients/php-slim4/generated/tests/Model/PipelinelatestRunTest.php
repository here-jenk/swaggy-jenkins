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
 * The version of the OpenAPI document: 1.1.2-pre.0
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
use OpenAPIServer\Model\PipelinelatestRun;

/**
 * PipelinelatestRunTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\PipelinelatestRun
 */
class PipelinelatestRunTest extends TestCase
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
     * Test "PipelinelatestRun"
     */
    public function testPipelinelatestRun()
    {
        $testPipelinelatestRun = new PipelinelatestRun();
        $namespacedClassname = PipelinelatestRun::getModelsNamespace() . '\\PipelinelatestRun';
        $this->assertSame('\\' . PipelinelatestRun::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "artifacts"
     */
    public function testPropertyArtifacts()
    {
        $this->markTestIncomplete(
            'Test of "artifacts" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "durationInMillis"
     */
    public function testPropertyDurationInMillis()
    {
        $this->markTestIncomplete(
            'Test of "durationInMillis" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "estimatedDurationInMillis"
     */
    public function testPropertyEstimatedDurationInMillis()
    {
        $this->markTestIncomplete(
            'Test of "estimatedDurationInMillis" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "enQueueTime"
     */
    public function testPropertyEnQueueTime()
    {
        $this->markTestIncomplete(
            'Test of "enQueueTime" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "endTime"
     */
    public function testPropertyEndTime()
    {
        $this->markTestIncomplete(
            'Test of "endTime" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        $this->markTestIncomplete(
            'Test of "id" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "organization"
     */
    public function testPropertyOrganization()
    {
        $this->markTestIncomplete(
            'Test of "organization" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "pipeline"
     */
    public function testPropertyPipeline()
    {
        $this->markTestIncomplete(
            'Test of "pipeline" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "result"
     */
    public function testPropertyResult()
    {
        $this->markTestIncomplete(
            'Test of "result" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "runSummary"
     */
    public function testPropertyRunSummary()
    {
        $this->markTestIncomplete(
            'Test of "runSummary" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "startTime"
     */
    public function testPropertyStartTime()
    {
        $this->markTestIncomplete(
            'Test of "startTime" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "state"
     */
    public function testPropertyState()
    {
        $this->markTestIncomplete(
            'Test of "state" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "type"
     */
    public function testPropertyType()
    {
        $this->markTestIncomplete(
            'Test of "type" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "commitId"
     */
    public function testPropertyCommitId()
    {
        $this->markTestIncomplete(
            'Test of "commitId" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "class"
     */
    public function testPropertyClass()
    {
        $this->markTestIncomplete(
            'Test of "class" property in "PipelinelatestRun" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = PipelinelatestRun::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
