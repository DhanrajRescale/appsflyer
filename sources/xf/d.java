package xf;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final KycSupportTicketResponseDto f40206a;

    public d(KycSupportTicketResponseDto ticketData) {
        Intrinsics.checkNotNullParameter(ticketData, "ticketData");
        this.f40206a = ticketData;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(KycSupportTicketResponseDto.class);
        Parcelable parcelable = this.f40206a;
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

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.moveToQuerySubmitted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.a(this.f40206a, ((d) obj).f40206a);
    }

    public final int hashCode() {
        return this.f40206a.hashCode();
    }

    public final String toString() {
        return "MoveToQuerySubmitted(ticketData=" + this.f40206a + ")";
    }
}
