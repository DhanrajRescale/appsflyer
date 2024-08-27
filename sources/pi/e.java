package pi;

import ba.eo;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderViewModel;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import qj.r;

/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyBuyOrderFragment f31116b;

    public /* synthetic */ e(ModifyBuyOrderFragment modifyBuyOrderFragment, int i10) {
        this.f31115a = i10;
        this.f31116b = modifyBuyOrderFragment;
    }

    @Override // qj.r
    public final void f(String type) {
        int i10;
        Integer g10;
        int i11 = this.f31115a;
        ModifyBuyOrderFragment modifyBuyOrderFragment = this.f31116b;
        switch (i11) {
            case 0:
                if (!((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10283x && !((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10282w) {
                    ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10281v = true;
                    if (type != null && type.length() != 0) {
                        try {
                            ModifyBuyOrderViewModel modifyBuyOrderViewModel = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                            ij.h hVar = ij.h.f20067a;
                            String b10 = ij.h.b(modifyBuyOrderViewModel.f10284y + ij.h.a(type));
                            ModifyBuyOrderViewModel modifyBuyOrderViewModel2 = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                            double a10 = ij.h.a(b10);
                            double d10 = modifyBuyOrderViewModel2.f10284y;
                            double d11 = 100;
                            String b11 = ij.h.b(((a10 * d11) / d10) - d11);
                            ((eo) modifyBuyOrderFragment.q()).f4629s.f6522s.setPrice(Double.valueOf(ij.h.a(b10)));
                            ((eo) modifyBuyOrderFragment.q()).f4629s.f6524u.setDisplayValue(String.valueOf(ij.h.a(b11)));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6522s.o();
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6524u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 1:
                if (!((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10283x && !((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10281v) {
                    ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10282w = true;
                    if (type != null && type.length() != 0) {
                        try {
                            ModifyBuyOrderViewModel modifyBuyOrderViewModel3 = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                            ij.h hVar2 = ij.h.f20067a;
                            String b12 = ij.h.b(((ij.h.a(type) / 100) + 1) * modifyBuyOrderViewModel3.f10284y);
                            String b13 = ij.h.b(ij.h.a(b12) - ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10284y);
                            ((eo) modifyBuyOrderFragment.q()).f4629s.f6522s.setPrice(Double.valueOf(ij.h.a(b12)));
                            ((eo) modifyBuyOrderFragment.q()).f4629s.f6523t.setDisplayValue(String.valueOf(ij.h.a(b13)));
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6522s.o();
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6523t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 2:
                if (type != null) {
                    ModifyBuyOrderViewModel modifyBuyOrderViewModel4 = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                    Intrinsics.checkNotNullParameter(type, "type");
                    modifyBuyOrderViewModel4.M.postValue(type);
                    return;
                }
                return;
            case 3:
                if (type != null && (g10 = kotlin.text.r.g(type)) != null) {
                    i10 = g10.intValue();
                } else {
                    i10 = 0;
                }
                ModifyBuyOrderViewModel modifyBuyOrderViewModel5 = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                modifyBuyOrderViewModel5.F = i10;
                modifyBuyOrderViewModel5.K.postValue(Double.valueOf(i10 * modifyBuyOrderViewModel5.f10284y));
                return;
            case 4:
                if (!((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10280u && !((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10279t) {
                    ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10278s = true;
                    if (type != null && type.length() != 0) {
                        try {
                            ModifyBuyOrderViewModel modifyBuyOrderViewModel6 = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                            ij.h hVar3 = ij.h.f20067a;
                            String b14 = ij.h.b(modifyBuyOrderViewModel6.f10284y - ij.h.a(type));
                            ModifyBuyOrderViewModel modifyBuyOrderViewModel7 = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                            double a11 = ij.h.a(b14);
                            double d12 = modifyBuyOrderViewModel7.f10284y;
                            double d13 = 100;
                            String b15 = ij.h.b(d13 - ((a11 * d13) / d12));
                            ((eo) modifyBuyOrderFragment.q()).f4629s.G.setPrice(Double.valueOf(ij.h.a(b14)));
                            ((eo) modifyBuyOrderFragment.q()).f4629s.I.setDisplayValue(String.valueOf(ij.h.a(b15)));
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    ((eo) modifyBuyOrderFragment.q()).f4629s.G.o();
                    ((eo) modifyBuyOrderFragment.q()).f4629s.I.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            default:
                if (!((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10280u && !((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10278s) {
                    ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10279t = true;
                    if (type != null && type.length() != 0) {
                        try {
                            ModifyBuyOrderViewModel modifyBuyOrderViewModel8 = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                            ij.h hVar4 = ij.h.f20067a;
                            String b16 = ij.h.b((1 - (ij.h.a(type) / 100)) * modifyBuyOrderViewModel8.f10284y);
                            String b17 = ij.h.b(((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10284y - ij.h.a(b16));
                            ((eo) modifyBuyOrderFragment.q()).f4629s.G.setPrice(Double.valueOf(ij.h.a(b16)));
                            ((eo) modifyBuyOrderFragment.q()).f4629s.H.setDisplayValue(String.valueOf(ij.h.a(b17)));
                            return;
                        } catch (Exception unused4) {
                            return;
                        }
                    }
                    ((eo) modifyBuyOrderFragment.q()).f4629s.G.o();
                    ((eo) modifyBuyOrderFragment.q()).f4629s.H.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
        }
    }
}
