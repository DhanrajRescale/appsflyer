package qi;

import android.os.Bundle;
import androidx.navigation.h;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ModifyOrderDto f31970a;

    public c(ModifyOrderDto stock) {
        Intrinsics.checkNotNullParameter(stock, "stock");
        this.f31970a = stock;
    }

    @NotNull
    public static final c fromBundle(@NotNull Bundle bundle) {
        return j.m(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.a(this.f31970a, ((c) obj).f31970a);
    }

    public final int hashCode() {
        return this.f31970a.hashCode();
    }

    public final String toString() {
        return "ModifyOrderPaymentSuccessFragmentArgs(stock=" + this.f31970a + ")";
    }
}
