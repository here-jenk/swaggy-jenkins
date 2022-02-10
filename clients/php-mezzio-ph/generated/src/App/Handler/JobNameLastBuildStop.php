<?php
declare(strict_types=1);

namespace App\Handler;

use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/job/{name}/lastBuild/stop")
 */
class JobNameLastBuildStop
{
    /**
     * @PHA\Post()
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     */
    public function postJobLastBuildStop(ServerRequestInterface $request)
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
