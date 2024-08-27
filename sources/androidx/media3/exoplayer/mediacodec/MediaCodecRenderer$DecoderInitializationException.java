package androidx.media3.exoplayer.mediacodec;

import b5.v;
import o5.m;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f2089a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2090b;

    /* renamed from: c, reason: collision with root package name */
    public final m f2091c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2092d;

    public MediaCodecRenderer$DecoderInitializationException(int i10, v vVar, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z10) {
        this("Decoder init failed: [" + i10 + "], " + vVar, mediaCodecUtil$DecoderQueryException, vVar.f3652l, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : HttpUrl.FRAGMENT_ENCODE_SET) + Math.abs(i10));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, m mVar, String str3) {
        super(str, th2);
        this.f2089a = str2;
        this.f2090b = z10;
        this.f2091c = mVar;
        this.f2092d = str3;
    }
}
