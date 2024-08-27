package xf;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.KycResponseDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final KycResponseDto f40226a;

    public n(KycResponseDto kycData) {
        Intrinsics.checkNotNullParameter(kycData, "kycData");
        this.f40226a = kycData;
    }

    @NotNull
    public static final n fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", n.class, "kycData")) {
            if (!Parcelable.class.isAssignableFrom(KycResponseDto.class) && !Serializable.class.isAssignableFrom(KycResponseDto.class)) {
                throw new UnsupportedOperationException(KycResponseDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            KycResponseDto kycResponseDto = (KycResponseDto) bundle.get("kycData");
            if (kycResponseDto != null) {
                return new n(kycResponseDto);
            }
            throw new IllegalArgumentException("Argument \"kycData\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"kycData\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.a(this.f40226a, ((n) obj).f40226a);
    }

    public final int hashCode() {
        return this.f40226a.hashCode();
    }

    public final String toString() {
        return "KycPermissionFragmentArgs(kycData=" + this.f40226a + ")";
    }
}
