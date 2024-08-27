package c5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f7956a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    b e(b bVar);

    void f();

    void flush();

    boolean g();

    void h();
}
