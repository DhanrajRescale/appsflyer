package hk;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e0 implements xj.m {

    /* renamed from: d, reason: collision with root package name */
    public static final xj.j f18528d = new xj.j("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new b0(0));

    /* renamed from: e, reason: collision with root package name */
    public static final xj.j f18529e = new xj.j("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b0(1));

    /* renamed from: f, reason: collision with root package name */
    public static final ek.e f18530f = new ek.e(5);

    /* renamed from: a, reason: collision with root package name */
    public final d0 f18531a;

    /* renamed from: b, reason: collision with root package name */
    public final bk.d f18532b;

    /* renamed from: c, reason: collision with root package name */
    public final ek.e f18533c = f18530f;

    public e0(bk.d dVar, d0 d0Var) {
        this.f18532b = dVar;
        this.f18531a = d0Var;
    }

    public static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && lVar != l.f18543d) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float b10 = lVar.b(parseInt, parseInt2, i11, i12);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(parseInt * b10), Math.round(b10 * parseInt2));
            } catch (Throwable th2) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th2);
                }
            }
        }
        if (bitmap == null) {
            return mediaMetadataRetriever.getFrameAtTime(j10, i10);
        }
        return bitmap;
    }

    @Override // xj.m
    public final ak.e0 a(Object obj, int i10, int i11, xj.k kVar) {
        long longValue = ((Long) kVar.c(f18528d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(nn.d.j("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) kVar.c(f18529e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) kVar.c(l.f18545f);
        if (lVar == null) {
            lVar = l.f18544e;
        }
        l lVar2 = lVar;
        this.f18533c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f18531a.j(mediaMetadataRetriever, obj);
                Bitmap c10 = c(mediaMetadataRetriever, longValue, num.intValue(), i10, i11, lVar2);
                mediaMetadataRetriever.release();
                return c.e(c10, this.f18532b);
            } catch (RuntimeException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    @Override // xj.m
    public final boolean b(Object obj, xj.k kVar) {
        return true;
    }
}
