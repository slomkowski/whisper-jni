package io.github.givimad.whisperjni;

/**
 * The {@link WhisperContextParams} class contains the {@link WhisperContext} params.
 *
 * @author Miguel Álvarez Díez - Initial contribution
 */
public class WhisperContextParams {
    /**
     * Enables GPU usage.
     */
    public boolean useGPU = true;

    /**
     * GPU device to use.
     */
    public int gpuDevice = 0;

    /**
     * Public constructor.
     */
    public WhisperContextParams() {

    }
}
