package p8;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vt.v;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f30754a;

    static {
        String[] elements = {"image/jpeg", "image/webp", "image/heic", "image/heif"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f30754a = v.B(elements);
    }
}
