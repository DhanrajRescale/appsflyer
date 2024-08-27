package jk;

import ak.e0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import xj.k;
import xj.m;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final ek.h f21414f = new ek.h(5);

    /* renamed from: g, reason: collision with root package name */
    public static final ck.c f21415g = new ck.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f21416a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21417b;

    /* renamed from: c, reason: collision with root package name */
    public final ck.c f21418c;

    /* renamed from: d, reason: collision with root package name */
    public final ek.h f21419d;

    /* renamed from: e, reason: collision with root package name */
    public final da.d f21420e;

    public a(Context context, List list, bk.d dVar, bk.h hVar) {
        ek.h hVar2 = f21414f;
        this.f21416a = context.getApplicationContext();
        this.f21417b = list;
        this.f21419d = hVar2;
        this.f21420e = new da.d(dVar, hVar, 16);
        this.f21418c = f21415g;
    }

    public static int d(wj.c cVar, int i10, int i11) {
        int highestOneBit;
        int min = Math.min(cVar.f39114g / i11, cVar.f39113f / i10);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder q10 = da.e.q("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i10, "x");
            q10.append(i11);
            q10.append("], actual dimens: [");
            q10.append(cVar.f39113f);
            q10.append("x");
            q10.append(cVar.f39114g);
            q10.append("]");
            Log.v("BufferGifDecoder", q10.toString());
        }
        return max;
    }

    @Override // xj.m
    public final e0 a(Object obj, int i10, int i11, k kVar) {
        wj.d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        ck.c cVar = this.f21418c;
        synchronized (cVar) {
            try {
                wj.d dVar2 = (wj.d) cVar.f8191a.poll();
                if (dVar2 == null) {
                    dVar2 = new wj.d();
                }
                dVar = dVar2;
                dVar.f39120b = null;
                Arrays.fill(dVar.f39119a, (byte) 0);
                dVar.f39121c = new wj.c();
                dVar.f39122d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                dVar.f39120b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                dVar.f39120b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            ik.b c10 = c(byteBuffer, i10, i11, dVar, kVar);
            ck.c cVar2 = this.f21418c;
            synchronized (cVar2) {
                dVar.f39120b = null;
                dVar.f39121c = null;
                cVar2.f8191a.offer(dVar);
            }
            return c10;
        } catch (Throwable th3) {
            ck.c cVar3 = this.f21418c;
            synchronized (cVar3) {
                dVar.f39120b = null;
                dVar.f39121c = null;
                cVar3.f8191a.offer(dVar);
                throw th3;
            }
        }
    }

    @Override // xj.m
    public final boolean b(Object obj, k kVar) {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) kVar.c(i.f21456b)).booleanValue()) {
            return false;
        }
        if (byteBuffer == null) {
            imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
        } else {
            List list = this.f21417b;
            int size = list.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    ImageHeaderParser$ImageType a10 = ((xj.d) list.get(i10)).a(byteBuffer);
                    if (a10 != ImageHeaderParser$ImageType.UNKNOWN) {
                        imageHeaderParser$ImageType = a10;
                        break;
                    }
                    i10++;
                } else {
                    imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
                    break;
                }
            }
        }
        if (imageHeaderParser$ImageType != ImageHeaderParser$ImageType.GIF) {
            return false;
        }
        return true;
    }

    public final ik.b c(ByteBuffer byteBuffer, int i10, int i11, wj.d dVar, k kVar) {
        Bitmap.Config config;
        int i12 = rk.f.f33941b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i13 = 2;
        try {
            wj.c b10 = dVar.b();
            if (b10.f39110c > 0 && b10.f39109b == 0) {
                if (kVar.c(i.f21455a) == xj.b.f40293b) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th2) {
                        th = th2;
                        if (Log.isLoggable("BufferGifDecoder", i13)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + rk.f.a(elapsedRealtimeNanos));
                        }
                        throw th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d10 = d(b10, i10, i11);
                ek.h hVar = this.f21419d;
                da.d dVar2 = this.f21420e;
                hVar.getClass();
                wj.e eVar = new wj.e(dVar2, b10, byteBuffer, d10);
                eVar.c(config);
                eVar.f39133k = (eVar.f39133k + 1) % eVar.f39134l.f39110c;
                Bitmap b11 = eVar.b();
                if (b11 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + rk.f.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                ik.b bVar = new ik.b(new c(new b(new h(com.bumptech.glide.b.b(this.f21416a), eVar, i10, i11, gk.a.f17446b, b11))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + rk.f.a(elapsedRealtimeNanos));
                }
                return bVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + rk.f.a(elapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            i13 = 2;
        }
    }
}
