package td;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f35829a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35831c;

    public c0(String groupId, String str, int i10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f35829a = groupId;
        this.f35830b = str;
        this.f35831c = i10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f35829a);
        bundle.putString("groupDescription", this.f35830b);
        bundle.putInt("groupDescriptionCharLimit", this.f35831c);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_group_info_to_edit_group_description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.a(this.f35829a, c0Var.f35829a) && Intrinsics.a(this.f35830b, c0Var.f35830b) && this.f35831c == c0Var.f35831c;
    }

    public final int hashCode() {
        int hashCode = this.f35829a.hashCode() * 31;
        String str = this.f35830b;
        return Integer.hashCode(this.f35831c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionGroupInfoToEditGroupDescription(groupId=");
        sb2.append(this.f35829a);
        sb2.append(", groupDescription=");
        sb2.append(this.f35830b);
        sb2.append(", groupDescriptionCharLimit=");
        return nn.d.m(sb2, this.f35831c, ")");
    }
}
