package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderException;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: a, reason: collision with root package name */
    public final String f2088a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaCodecDecoderException(java.lang.IllegalStateException r3, o5.m r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder failed: "
            r0.<init>(r1)
            r1 = 0
            if (r4 != 0) goto Lc
            r4 = r1
            goto Le
        Lc:
            java.lang.String r4 = r4.f29630a
        Le:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4, r3)
            int r4 = e5.x.f15050a
            r0 = 21
            if (r4 < r0) goto L28
            boolean r4 = r3 instanceof android.media.MediaCodec.CodecException
            if (r4 == 0) goto L28
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            java.lang.String r1 = r3.getDiagnosticInfo()
        L28:
            r2.f2088a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException.<init>(java.lang.IllegalStateException, o5.m):void");
    }
}
