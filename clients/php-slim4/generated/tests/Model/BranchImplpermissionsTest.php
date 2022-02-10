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
use OpenAPIServer\Model\BranchImplpermissions;

/**
 * BranchImplpermissionsTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\BranchImplpermissions
 */
class BranchImplpermissionsTest extends TestCase
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
     * Test "BranchImplpermissions"
     */
    public function testBranchImplpermissions()
    {
        $testBranchImplpermissions = new BranchImplpermissions();
        $namespacedClassname = BranchImplpermissions::getModelsNamespace() . '\\BranchImplpermissions';
        $this->assertSame('\\' . BranchImplpermissions::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "BranchImplpermissions" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "create"
     */
    public function testPropertyCreate()
    {
        $this->markTestIncomplete(
            'Test of "create" property in "BranchImplpermissions" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "read"
     */
    public function testPropertyRead()
    {
        $this->markTestIncomplete(
            'Test of "read" property in "BranchImplpermissions" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "start"
     */
    public function testPropertyStart()
    {
        $this->markTestIncomplete(
            'Test of "start" property in "BranchImplpermissions" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "stop"
     */
    public function testPropertyStop()
    {
        $this->markTestIncomplete(
            'Test of "stop" property in "BranchImplpermissions" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "class"
     */
    public function testPropertyClass()
    {
        $this->markTestIncomplete(
            'Test of "class" property in "BranchImplpermissions" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = BranchImplpermissions::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
