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
use OpenAPIServer\Model\PipelineImpllinks;

/**
 * PipelineImpllinksTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\PipelineImpllinks
 */
class PipelineImpllinksTest extends TestCase
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
     * Test "PipelineImpllinks"
     */
    public function testPipelineImpllinks()
    {
        $testPipelineImpllinks = new PipelineImpllinks();
        $namespacedClassname = PipelineImpllinks::getModelsNamespace() . '\\PipelineImpllinks';
        $this->assertSame('\\' . PipelineImpllinks::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "PipelineImpllinks" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "runs"
     */
    public function testPropertyRuns()
    {
        $this->markTestIncomplete(
            'Test of "runs" property in "PipelineImpllinks" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "self"
     */
    public function testPropertySelf()
    {
        $this->markTestIncomplete(
            'Test of "self" property in "PipelineImpllinks" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "queue"
     */
    public function testPropertyQueue()
    {
        $this->markTestIncomplete(
            'Test of "queue" property in "PipelineImpllinks" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "actions"
     */
    public function testPropertyActions()
    {
        $this->markTestIncomplete(
            'Test of "actions" property in "PipelineImpllinks" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "class"
     */
    public function testPropertyClass()
    {
        $this->markTestIncomplete(
            'Test of "class" property in "PipelineImpllinks" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = PipelineImpllinks::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
