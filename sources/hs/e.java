package hs;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import h.b0;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* loaded from: classes2.dex */
public class e extends a {

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f18702f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18700d = false;

    /* renamed from: e, reason: collision with root package name */
    public LinkedList f18701e = new LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final Random f18703g = new Random();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hs.a
    public int a(js.a aVar, js.f fVar) {
        if (((b0) aVar).d("WebSocket-Origin").equals(((b0) fVar).d("Origin")) && a.c(fVar)) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hs.a
    public int b(js.a aVar) {
        if (((b0) aVar).e("Origin") && a.c(aVar)) {
            return 1;
        }
        return 2;
    }

    @Override // hs.a
    public ByteBuffer e(is.d dVar) {
        if (((is.e) dVar).f20527b == 2) {
            ByteBuffer a10 = dVar.a();
            ByteBuffer allocate = ByteBuffer.allocate(a10.remaining() + 2);
            allocate.put((byte) 0);
            a10.mark();
            allocate.put(a10);
            a10.reset();
            allocate.put((byte) -1);
            allocate.flip();
            return allocate;
        }
        throw new RuntimeException("only text frames supported");
    }

    @Override // hs.a
    public int f() {
        return 1;
    }

    @Override // hs.a
    public js.a g(js.c cVar) {
        cVar.h("Upgrade", "WebSocket");
        cVar.h("Connection", "Upgrade");
        if (!cVar.e("Origin")) {
            cVar.h("Origin", "random" + this.f18703g.nextInt());
        }
        return cVar;
    }

    @Override // hs.a
    public final void i() {
        this.f18700d = false;
        this.f18702f = null;
    }

    @Override // hs.a
    public List j(ByteBuffer byteBuffer) {
        List m10 = m(byteBuffer);
        if (m10 != null) {
            return m10;
        }
        throw new InvalidDataException(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [is.e, java.lang.Object] */
    public final List m(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            byte b10 = byteBuffer.get();
            if (b10 == 0) {
                if (!this.f18700d) {
                    this.f18700d = true;
                } else {
                    throw new InvalidFrameException("unexpected START_OF_FRAME");
                }
            } else if (b10 == -1) {
                if (this.f18700d) {
                    ByteBuffer byteBuffer2 = this.f18702f;
                    if (byteBuffer2 != null) {
                        byteBuffer2.flip();
                        ?? obj = new Object();
                        obj.f20528c = this.f18702f;
                        obj.f20526a = true;
                        obj.f20527b = 2;
                        this.f18701e.add(obj);
                        this.f18702f = null;
                        byteBuffer.mark();
                    }
                    this.f18700d = false;
                } else {
                    throw new InvalidFrameException("unexpected END_OF_FRAME");
                }
            } else {
                if (!this.f18700d) {
                    return null;
                }
                ByteBuffer byteBuffer3 = this.f18702f;
                if (byteBuffer3 == null) {
                    this.f18702f = ByteBuffer.allocate(64);
                } else if (!byteBuffer3.hasRemaining()) {
                    ByteBuffer byteBuffer4 = this.f18702f;
                    byteBuffer4.flip();
                    int capacity = byteBuffer4.capacity() * 2;
                    a.d(capacity);
                    ByteBuffer allocate = ByteBuffer.allocate(capacity);
                    allocate.put(byteBuffer4);
                    this.f18702f = allocate;
                }
                this.f18702f.put(b10);
            }
        }
        LinkedList linkedList = this.f18701e;
        this.f18701e = new LinkedList();
        return linkedList;
    }
}
