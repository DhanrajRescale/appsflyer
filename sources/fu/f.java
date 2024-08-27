package fu;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final File f16258a;

    public f(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f16258a = root;
    }

    public abstract File a();
}
