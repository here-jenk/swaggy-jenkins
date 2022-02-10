<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PipelineImpllinks
{
    /**
     * @DTA\Data(field="runs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Link::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Link::class})
     * @var \App\DTO\Link|null
     */
    public $runs;

    /**
     * @DTA\Data(field="self", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Link::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Link::class})
     * @var \App\DTO\Link|null
     */
    public $self;

    /**
     * @DTA\Data(field="queue", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Link::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Link::class})
     * @var \App\DTO\Link|null
     */
    public $queue;

    /**
     * @DTA\Data(field="actions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Link::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Link::class})
     * @var \App\DTO\Link|null
     */
    public $actions;

    /**
     * @DTA\Data(field="_class", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $_class;

}
