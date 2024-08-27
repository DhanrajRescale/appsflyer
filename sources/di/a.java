package di;

import android.os.Parcel;
import android.os.Parcelable;
import hb.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final a f14383a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f14384b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, di.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, di.a] */
    static {
        ?? r02 = new Enum("URI", 0);
        ?? r12 = new Enum("URL", 1);
        f14383a = r12;
        a[] aVarArr = {r02, r12};
        f14384b = aVarArr;
        f.E(aVarArr);
        CREATOR = new e(28);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14384b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
