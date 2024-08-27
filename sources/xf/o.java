package xf;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final KycSupportTicketResponseDto f40227a;

    public o(KycSupportTicketResponseDto ticketData) {
        Intrinsics.checkNotNullParameter(ticketData, "ticketData");
        this.f40227a = ticketData;
    }

    @NotNull
    public static final o fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", o.class, "ticketData")) {
            if (!Parcelable.class.isAssignableFrom(KycSupportTicketResponseDto.class) && !Serializable.class.isAssignableFrom(KycSupportTicketResponseDto.class)) {
                throw new UnsupportedOperationException(KycSupportTicketResponseDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            KycSupportTicketResponseDto kycSupportTicketResponseDto = (KycSupportTicketResponseDto) bundle.get("ticketData");
            if (kycSupportTicketResponseDto != null) {
                return new o(kycSupportTicketResponseDto);
            }
            throw new IllegalArgumentException("Argument \"ticketData\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"ticketData\" is missing and does not have an android:defaultValue");
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(KycSupportTicketResponseDto.class);
        Parcelable parcelable = this.f40227a;
        if (isAssignableFrom) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("ticketData", parcelable);
        } else if (Serializable.class.isAssignableFrom(KycSupportTicketResponseDto.class)) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("ticketData", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(KycSupportTicketResponseDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.a(this.f40227a, ((o) obj).f40227a);
    }

    public final int hashCode() {
        return this.f40227a.hashCode();
    }

    public final String toString() {
        return "KycQuerySubmittedFragmentArgs(ticketData=" + this.f40227a + ")";
    }
}
