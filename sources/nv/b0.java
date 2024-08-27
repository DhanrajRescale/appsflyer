package nv;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class b0 extends ResponseBody {

    /* renamed from: a, reason: collision with root package name */
    public final MediaType f29180a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29181b;

    public b0(MediaType mediaType, long j10) {
        this.f29180a = mediaType;
        this.f29181b = j10;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long get$contentLength() {
        return this.f29181b;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.f29180a;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final bv.l get$this_asResponseBody() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
