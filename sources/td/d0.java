package td;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f35858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35859b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35860c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f35861d;

    public d0(String groupId, int i10, String[] strArr, String groupName) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        this.f35858a = groupId;
        this.f35859b = groupName;
        this.f35860c = i10;
        this.f35861d = strArr;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f35858a);
        bundle.putString("groupName", this.f35859b);
        bundle.putInt("groupNameCharLimit", this.f35860c);
        bundle.putStringArray("groupTags", this.f35861d);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_group_info_to_edit_group_name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.a(this.f35858a, d0Var.f35858a) && Intrinsics.a(this.f35859b, d0Var.f35859b) && this.f35860c == d0Var.f35860c && Intrinsics.a(this.f35861d, d0Var.f35861d);
    }

    public final int hashCode() {
        int hashCode;
        int f10 = da.e.f(this.f35860c, jr.h.g(this.f35859b, this.f35858a.hashCode() * 31, 31), 31);
        String[] strArr = this.f35861d;
        if (strArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(strArr);
        }
        return f10 + hashCode;
    }

    public final String toString() {
        return "ActionGroupInfoToEditGroupName(groupId=" + this.f35858a + ", groupName=" + this.f35859b + ", groupNameCharLimit=" + this.f35860c + ", groupTags=" + Arrays.toString(this.f35861d) + ")";
    }
}
