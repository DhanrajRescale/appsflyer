package i5;

import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f19434a;

    /* renamed from: b, reason: collision with root package name */
    public int f19435b;

    /* renamed from: c, reason: collision with root package name */
    public int f19436c;

    /* renamed from: d, reason: collision with root package name */
    public int f19437d;

    /* renamed from: e, reason: collision with root package name */
    public int f19438e;

    /* renamed from: f, reason: collision with root package name */
    public int f19439f;

    /* renamed from: g, reason: collision with root package name */
    public int f19440g;

    /* renamed from: h, reason: collision with root package name */
    public int f19441h;

    /* renamed from: i, reason: collision with root package name */
    public int f19442i;

    /* renamed from: j, reason: collision with root package name */
    public int f19443j;

    /* renamed from: k, reason: collision with root package name */
    public long f19444k;

    /* renamed from: l, reason: collision with root package name */
    public int f19445l;

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f19434a), Integer.valueOf(this.f19435b), Integer.valueOf(this.f19436c), Integer.valueOf(this.f19437d), Integer.valueOf(this.f19438e), Integer.valueOf(this.f19439f), Integer.valueOf(this.f19440g), Integer.valueOf(this.f19441h), Integer.valueOf(this.f19442i), Integer.valueOf(this.f19443j), Long.valueOf(this.f19444k), Integer.valueOf(this.f19445l)};
        int i10 = e5.x.f15050a;
        return String.format(Locale.US, "DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", objArr);
    }
}
