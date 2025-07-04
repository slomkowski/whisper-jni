package io.github.givimad.whisperjni;

public class WhisperTokenData {
    private final int id;
    private final int tid;
    private final float p;
    private final float plog;
    private final float pt;
    private final float ptsum;
    private final long t0;
    private final long t1;
    private final long t_dtw;
    private final float vlen;

    // Constructor with all fields
    public WhisperTokenData(int id, int tid, float p, float plog, float pt, float ptsum, long t0, long t1, long tDtw, float vlen) {
        this.id = id;
        this.tid = tid;
        this.p = p;
        this.plog = plog;
        this.pt = pt;
        this.ptsum = ptsum;
        this.t0 = t0;
        this.t1 = t1;
        this.t_dtw = tDtw;
        this.vlen = vlen;
    }

    /**
     * @return token id
     */
    public int getId() {
        return id;
    }

    /**
     * @return forced timestamp token id
     */
    public int getTid() {
        return tid;
    }

    /**
     * @return probability of the token
     */
    public float getP() {
        return p;
    }

    /**
     * @return log probability of the token
     */
    public float getPlog() {
        return plog;
    }

    /**
     * @return probability of the timestamp token
     */
    public float getPt() {
        return pt;
    }

    /**
     * @return sum of probabilities of all timestamp tokens
     */
    public float getPtsum() {
        return ptsum;
    }

    /**
     * Returns start time of the token.
     * Do not use if you haven't computed token-level timestamps.
     *
     * @return start time of the token
     */
    public long getT0() {
        return t0;
    }

    /**
     * Returns end time of the token.
     * Do not use if you haven't computed token-level timestamps.
     *
     * @return end time of the token
     */
    public long getT1() {
        return t1;
    }

    /**
     * Roughly corresponds to the moment in audio in which the token was output.
     * [EXPERIMENTAL] Token-level timestamps with DTW.
     * Do not use if you haven't computed token-level timestamps with dtw.
     *
     * @return moment in audio when token was output
     */
    public long getTdtw() {
        return t_dtw;
    }

    /**
     * @return voice length of the token
     */
    public float getVlen() {
        return vlen;
    }
}
