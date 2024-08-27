package nv;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class r0 extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final RequestBody f29244a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaType f29245b;

    public r0(RequestBody requestBody, MediaType mediaType) {
        this.f29244a = requestBody;
        this.f29245b = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f29244a.contentLength();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.f29245b;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(bv.k kVar) {
        this.f29244a.writeTo(kVar);
    }
}
