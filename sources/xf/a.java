package xf;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.KycResponseDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final KycResponseDto f40199a;

    public a(KycResponseDto kycData) {
        Intrinsics.checkNotNullParameter(kycData, "kycData");
        this.f40199a = kycData;
    }

    @NotNull
    public static final a fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", a.class, "kycData")) {
            if (!Parcelable.class.isAssignableFrom(KycResponseDto.class) && !Serializable.class.isAssignableFrom(KycResponseDto.class)) {
                throw new UnsupportedOperationException(KycResponseDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            KycResponseDto kycResponseDto = (KycResponseDto) bundle.get("kycData");
            if (kycResponseDto != null) {
                return new a(kycResponseDto);
            }
            throw new IllegalArgumentException("Argument \"kycData\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"kycData\" is missing and does not have an android:defaultValue");
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(KycResponseDto.class);
        Parcelable parcelable = this.f40199a;
        if (isAssignableFrom) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("kycData", parcelable);
        } else if (Serializable.class.isAssignableFrom(KycResponseDto.class)) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("kycData", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(KycResponseDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.a(this.f40199a, ((a) obj).f40199a);
    }

    public final int hashCode() {
        return this.f40199a.hashCode();
    }

    public final String toString() {
        return "KycCompletedFragmentArgs(kycData=" + this.f40199a + ")";
    }
}
