package ut;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"Lut/o;", "T", "Lut/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class o<T> implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f37397a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f37398b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f37399c;

    public o(Function0 initializer, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i10 & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f37397a = initializer;
        this.f37398b = u.f37409a;
        this.f37399c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new e(getValue());
    }

    @Override // ut.g
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f37398b;
        u uVar = u.f37409a;
        if (obj2 != uVar) {
            return obj2;
        }
        synchronized (this.f37399c) {
            obj = this.f37398b;
            if (obj == uVar) {
                Function0 function0 = this.f37397a;
                Intrinsics.c(function0);
                obj = function0.mo2invoke();
                this.f37398b = obj;
                this.f37397a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f37398b != u.f37409a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
