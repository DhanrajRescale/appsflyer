package sb;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f34425a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34426b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34427c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34428d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34429e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34430f;

    public a(String feedType, String str, String str2, String str3, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f34425a = feedType;
        this.f34426b = str;
        this.f34427c = str2;
        this.f34428d = z10;
        this.f34429e = str3;
        this.f34430f = z11;
    }

    @NotNull
    public static final a fromBundle(@NotNull Bundle bundle) {
        boolean z10;
        if (da.e.y(bundle, "bundle", a.class, "feedType")) {
            String string = bundle.getString("feedType");
            if (string != null) {
                if (bundle.containsKey("entityId")) {
                    String string2 = bundle.getString("entityId");
                    if (bundle.containsKey("toolbarTitle")) {
                        String string3 = bundle.getString("toolbarTitle");
                        if (bundle.containsKey("callFromChats")) {
                            boolean z11 = bundle.getBoolean("callFromChats");
                            if (bundle.containsKey("postId")) {
                                String string4 = bundle.getString("postId");
                                if (bundle.containsKey("showToolbar")) {
                                    z10 = bundle.getBoolean("showToolbar");
                                } else {
                                    z10 = false;
                                }
                                return new a(string, string2, string3, string4, z11, z10);
                            }
                            throw new IllegalArgumentException("Required argument \"postId\" is missing and does not have an android:defaultValue");
                        }
                        throw new IllegalArgumentException("Required argument \"callFromChats\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Required argument \"toolbarTitle\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"entityId\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"feedType\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"feedType\" is missing and does not have an android:defaultValue");
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("feedType", this.f34425a);
        bundle.putString("entityId", this.f34426b);
        bundle.putString("toolbarTitle", this.f34427c);
        bundle.putBoolean("callFromChats", this.f34428d);
        bundle.putString("postId", this.f34429e);
        bundle.putBoolean("showToolbar", this.f34430f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f34425a, aVar.f34425a) && Intrinsics.a(this.f34426b, aVar.f34426b) && Intrinsics.a(this.f34427c, aVar.f34427c) && this.f34428d == aVar.f34428d && Intrinsics.a(this.f34429e, aVar.f34429e) && this.f34430f == aVar.f34430f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f34425a.hashCode() * 31;
        int i10 = 0;
        String str = this.f34426b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        String str2 = this.f34427c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int d10 = v.e.d(this.f34428d, (i11 + hashCode2) * 31, 31);
        String str3 = this.f34429e;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return Boolean.hashCode(this.f34430f) + ((d10 + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedStreamComposeFragmentArgs(feedType=");
        sb2.append(this.f34425a);
        sb2.append(", entityId=");
        sb2.append(this.f34426b);
        sb2.append(", toolbarTitle=");
        sb2.append(this.f34427c);
        sb2.append(", callFromChats=");
        sb2.append(this.f34428d);
        sb2.append(", postId=");
        sb2.append(this.f34429e);
        sb2.append(", showToolbar=");
        return da.e.o(sb2, this.f34430f, ")");
    }
}
