package cg;

import android.os.Bundle;
import androidx.navigation.h;
import da.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f8132a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8133b;

    public b(String transactionId, String transactionStatus) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionStatus, "transactionStatus");
        this.f8132a = transactionId;
        this.f8133b = transactionStatus;
    }

    @NotNull
    public static final b fromBundle(@NotNull Bundle bundle) {
        if (e.y(bundle, "bundle", b.class, "transactionId")) {
            String string = bundle.getString("transactionId");
            if (string != null) {
                if (bundle.containsKey("transactionStatus")) {
                    String string2 = bundle.getString("transactionStatus");
                    if (string2 != null) {
                        return new b(string, string2);
                    }
                    throw new IllegalArgumentException("Argument \"transactionStatus\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"transactionStatus\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"transactionId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"transactionId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f8132a, bVar.f8132a) && Intrinsics.a(this.f8133b, bVar.f8133b);
    }

    public final int hashCode() {
        return this.f8133b.hashCode() + (this.f8132a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletTransactionDetailFragmentArgs(transactionId=");
        sb2.append(this.f8132a);
        sb2.append(", transactionStatus=");
        return nn.d.o(sb2, this.f8133b, ")");
    }
}
