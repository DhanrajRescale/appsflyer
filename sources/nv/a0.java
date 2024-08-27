package nv;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class a0 extends ResponseBody {

    /* renamed from: a, reason: collision with root package name */
    public final ResponseBody f29176a;

    /* renamed from: b, reason: collision with root package name */
    public final bv.e0 f29177b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f29178c;

    public a0(ResponseBody responseBody) {
        this.f29176a = responseBody;
        this.f29177b = hl.f.v(new p8.b(this, responseBody.getSource()));
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f29176a.close();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getContentLength() {
        return this.f29176a.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.f29176a.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final bv.l getSource() {
        return this.f29177b;
    }
}
