package bv;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f7350a = new f0(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f7351b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f7352c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f7351b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f7352c = atomicReferenceArr;
    }

    public static final void a(f0 segment) {
        int i10;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f7348f == null && segment.f7349g == null) {
            if (segment.f7346d) {
                return;
            }
            AtomicReference atomicReference = f7352c[(int) (Thread.currentThread().getId() & (f7351b - 1))];
            f0 f0Var = f7350a;
            f0 f0Var2 = (f0) atomicReference.getAndSet(f0Var);
            if (f0Var2 == f0Var) {
                return;
            }
            if (f0Var2 != null) {
                i10 = f0Var2.f7345c;
            } else {
                i10 = 0;
            }
            if (i10 >= 65536) {
                atomicReference.set(f0Var2);
                return;
            }
            segment.f7348f = f0Var2;
            segment.f7344b = 0;
            segment.f7345c = i10 + UserMetadata.MAX_INTERNAL_KEY_SIZE;
            atomicReference.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final f0 b() {
        AtomicReference atomicReference = f7352c[(int) (Thread.currentThread().getId() & (f7351b - 1))];
        f0 f0Var = f7350a;
        f0 f0Var2 = (f0) atomicReference.getAndSet(f0Var);
        if (f0Var2 == f0Var) {
            return new f0();
        }
        if (f0Var2 == null) {
            atomicReference.set(null);
            return new f0();
        }
        atomicReference.set(f0Var2.f7348f);
        f0Var2.f7348f = null;
        f0Var2.f7345c = 0;
        return f0Var2;
    }
}
