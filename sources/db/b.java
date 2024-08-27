package db;

import android.os.Bundle;
import androidx.navigation.h;
import da.e;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f14283a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14284b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14285c;

    public b(String phoneNumber, String otp, String sessionId) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f14283a = phoneNumber;
        this.f14284b = otp;
        this.f14285c = sessionId;
    }

    @NotNull
    public static final b fromBundle(@NotNull Bundle bundle) {
        if (e.y(bundle, "bundle", b.class, "phoneNumber")) {
            String string = bundle.getString("phoneNumber");
            if (string != null) {
                if (bundle.containsKey("otp")) {
                    String string2 = bundle.getString("otp");
                    if (string2 != null) {
                        if (bundle.containsKey("sessionId")) {
                            String string3 = bundle.getString("sessionId");
                            if (string3 != null) {
                                return new b(string, string2, string3);
                            }
                            throw new IllegalArgumentException("Argument \"sessionId\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"sessionId\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"otp\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"otp\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f14283a, bVar.f14283a) && Intrinsics.a(this.f14284b, bVar.f14284b) && Intrinsics.a(this.f14285c, bVar.f14285c);
    }

    public final int hashCode() {
        return this.f14285c.hashCode() + jr.h.g(this.f14284b, this.f14283a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReSetPin2FragmentArgs(phoneNumber=");
        sb2.append(this.f14283a);
        sb2.append(", otp=");
        sb2.append(this.f14284b);
        sb2.append(", sessionId=");
        return d.o(sb2, this.f14285c, ")");
    }
}
