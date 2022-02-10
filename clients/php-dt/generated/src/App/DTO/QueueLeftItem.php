<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class QueueLeftItem
{
    /**
     * @DTA\Data(field="_class", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $_class;

    /**
     * @DTA\Data(field="actions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CauseAction[]|null
     */
    public $actions;

    /**
     * @DTA\Data(field="blocked", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $blocked;

    /**
     * @DTA\Data(field="buildable", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $buildable;

    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="inQueueSince", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $in_queue_since;

    /**
     * @DTA\Data(field="params", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $params;

    /**
     * @DTA\Data(field="stuck", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $stuck;

    /**
     * @DTA\Data(field="task", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FreeStyleProject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FreeStyleProject::class})
     * @var \App\DTO\FreeStyleProject|null
     */
    public $task;

    /**
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * @DTA\Data(field="why", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $why;

    /**
     * @DTA\Data(field="cancelled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $cancelled;

    /**
     * @DTA\Data(field="executable", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FreeStyleBuild::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FreeStyleBuild::class})
     * @var \App\DTO\FreeStyleBuild|null
     */
    public $executable;

}
