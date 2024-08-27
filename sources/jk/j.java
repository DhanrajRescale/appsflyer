package jk;

import ak.e0;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;
import xj.k;
import xj.m;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final List f21457a;

    /* renamed from: b, reason: collision with root package name */
    public final m f21458b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.h f21459c;

    public j(List list, a aVar, bk.h hVar) {
        this.f21457a = list;
        this.f21458b = aVar;
        this.f21459c = hVar;
    }

    @Override // xj.m
    public final e0 a(Object obj, int i10, int i11, k kVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr2 = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f21458b.a(ByteBuffer.wrap(bArr), i10, i11, kVar);
    }

    @Override // xj.m
    public final boolean b(Object obj, k kVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) kVar.c(i.f21456b)).booleanValue()) {
            if (al.d.s0(this.f21459c, inputStream, this.f21457a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
