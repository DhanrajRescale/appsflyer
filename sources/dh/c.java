package dh;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.ah;
import com.assetgro.stockgro.prod.R;
import iu.h;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends h implements hu.c {

    /* renamed from: i, reason: collision with root package name */
    public static final c f14382i = new c();

    public c() {
        super(3, ah.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/assetgro/stockgro/databinding/FragmentEnterPinDeleteBinding;", 0);
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(p02, "p0");
        int i10 = ah.f4200u;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        return (ah) m.g(p02, R.layout.fragment_enter_pin_delete, (ViewGroup) obj2, booleanValue, null);
    }
}
