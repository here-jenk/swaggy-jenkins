<?php
/**
 * PipelineRun
 */
namespace app\Models;

/**
 * PipelineRun
 */
class PipelineRun {

    /** @var string $class */
    private $class;

    /** @var \app\Models\PipelineRunartifacts[] $artifacts */
    private $artifacts;

    /** @var int $durationInMillis */
    private $durationInMillis;

    /** @var int $estimatedDurationInMillis */
    private $estimatedDurationInMillis;

    /** @var string $enQueueTime */
    private $enQueueTime;

    /** @var string $endTime */
    private $endTime;

    /** @var string $id */
    private $id;

    /** @var string $organization */
    private $organization;

    /** @var string $pipeline */
    private $pipeline;

    /** @var string $result */
    private $result;

    /** @var string $runSummary */
    private $runSummary;

    /** @var string $startTime */
    private $startTime;

    /** @var string $state */
    private $state;

    /** @var string $type */
    private $type;

    /** @var string $commitId */
    private $commitId;

}
