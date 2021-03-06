// Load system configuration and other settings
//load 'pipeline-config.groovy'

// Load Bpipe pipeline stages
load 'pipeline-stages.groovy'

run {
    "%.${input_type}" * [str_extract] +
        str_merge +
    "%.bin" * [str_call_joint] //+ str_outlier
}
