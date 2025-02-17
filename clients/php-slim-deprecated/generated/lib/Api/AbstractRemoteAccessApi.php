<?php
/**
 * AbstractRemoteAccessApi
 *
 * PHP version 7
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */
namespace OpenAPIServer\Api;

use Psr\Container\ContainerInterface;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;
use Exception;

/**
 * AbstractRemoteAccessApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractRemoteAccessApi
{

    /**
     * @var ContainerInterface Slim app container instance
     */
    protected $container;

    /**
     * Route Controller constructor receives container
     *
     * @param ContainerInterface $container Slim app container instance
     */
    public function __construct(ContainerInterface $container)
    {
        $this->container = $container;
    }


    /**
     * GET getComputer
     * Notes: Retrieve computer details
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getComputer(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $depth = $request->getQueryParam('depth');
        $message = "How about implementing getComputer as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getJenkins
     * Notes: Retrieve Jenkins details
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getJenkins(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getJenkins as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getJob
     * Notes: Retrieve job details
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getJob(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $name = $args['name'];
        $message = "How about implementing getJob as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getJobConfig
     * Notes: Retrieve job configuration
     * Output-Formats: [text/xml]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getJobConfig(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $name = $args['name'];
        $message = "How about implementing getJobConfig as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getJobLastBuild
     * Notes: Retrieve job&#39;s last build details
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getJobLastBuild(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $name = $args['name'];
        $message = "How about implementing getJobLastBuild as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getJobProgressiveText
     * Notes: Retrieve job&#39;s build progressive text output
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getJobProgressiveText(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $name = $args['name'];
        $number = $args['number'];
        $queryParams = $request->getQueryParams();
        $start = $request->getQueryParam('start');
        $message = "How about implementing getJobProgressiveText as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getQueue
     * Notes: Retrieve queue details
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getQueue(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getQueue as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getQueueItem
     * Notes: Retrieve queued item details
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getQueueItem(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $number = $args['number'];
        $message = "How about implementing getQueueItem as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getView
     * Notes: Retrieve view details
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getView(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $name = $args['name'];
        $message = "How about implementing getView as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getViewConfig
     * Notes: Retrieve view configuration
     * Output-Formats: [text/xml]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getViewConfig(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $name = $args['name'];
        $message = "How about implementing getViewConfig as a GET method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * HEAD headJenkins
     * Notes: Retrieve Jenkins headers
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function headJenkins(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing headJenkins as a HEAD method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postCreateItem
     * Notes: Create a new job using job configuration, or copied from an existing job
     * Output-Formats: [*_/_*]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postCreateItem(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $contentType = $request->hasHeader('Content-Type') ? $headers['Content-Type'] : null;
        $queryParams = $request->getQueryParams();
        $name = $request->getQueryParam('name');
        $from = $request->getQueryParam('from');
        $mode = $request->getQueryParam('mode');
        $body = $request->getParsedBody();
        $message = "How about implementing postCreateItem as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postCreateView
     * Notes: Create a new view using view configuration
     * Output-Formats: [*_/_*]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postCreateView(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $contentType = $request->hasHeader('Content-Type') ? $headers['Content-Type'] : null;
        $queryParams = $request->getQueryParams();
        $name = $request->getQueryParam('name');
        $body = $request->getParsedBody();
        $message = "How about implementing postCreateView as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postJobBuild
     * Notes: Build a job
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postJobBuild(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $name = $args['name'];
        $queryParams = $request->getQueryParams();
        $json = $request->getQueryParam('json');
        $token = $request->getQueryParam('token');
        $message = "How about implementing postJobBuild as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postJobConfig
     * Notes: Update job configuration
     * Output-Formats: [*_/_*]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postJobConfig(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $name = $args['name'];
        $body = $request->getParsedBody();
        $message = "How about implementing postJobConfig as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postJobDelete
     * Notes: Delete a job
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postJobDelete(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $name = $args['name'];
        $message = "How about implementing postJobDelete as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postJobDisable
     * Notes: Disable a job
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postJobDisable(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $name = $args['name'];
        $message = "How about implementing postJobDisable as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postJobEnable
     * Notes: Enable a job
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postJobEnable(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $name = $args['name'];
        $message = "How about implementing postJobEnable as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postJobLastBuildStop
     * Notes: Stop a job
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postJobLastBuildStop(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $name = $args['name'];
        $message = "How about implementing postJobLastBuildStop as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST postViewConfig
     * Notes: Update view configuration
     * Output-Formats: [*_/_*]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function postViewConfig(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $headers = $request->getHeaders();
        $jenkinsCrumb = $request->hasHeader('Jenkins-Crumb') ? $headers['Jenkins-Crumb'] : null;
        $name = $args['name'];
        $body = $request->getParsedBody();
        $message = "How about implementing postViewConfig as a POST method in OpenAPIServer\Api\RemoteAccessApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }
}
