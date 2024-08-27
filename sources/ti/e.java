package ti;

import ba.go;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderViewModel;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import qj.r;

/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyShortSellOrderFragment f36098b;

    public /* synthetic */ e(ModifyShortSellOrderFragment modifyShortSellOrderFragment, int i10) {
        this.f36097a = i10;
        this.f36098b = modifyShortSellOrderFragment;
    }

    @Override // qj.r
    public final void f(String type) {
        int i10;
        Integer g10;
        int i11 = this.f36097a;
        ModifyShortSellOrderFragment modifyShortSellOrderFragment = this.f36098b;
        switch (i11) {
            case 0:
                if (!((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10366v && !((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10365u) {
                    ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10364t = true;
                    if (type != null && type.length() != 0) {
                        try {
                            ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                            ij.h hVar = ij.h.f20067a;
                            String b10 = ij.h.b(modifyShortSellOrderViewModel.f10367w - ij.h.a(type));
                            ModifyShortSellOrderViewModel modifyShortSellOrderViewModel2 = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                            double a10 = ij.h.a(b10);
                            double d10 = modifyShortSellOrderViewModel2.f10367w;
                            double d11 = 100;
                            String b11 = ij.h.b(d11 - ((a10 * d11) / d10));
                            ((go) modifyShortSellOrderFragment.q()).f4834s.f6718s.setPrice(Double.valueOf(ij.h.a(b10)));
                            ((go) modifyShortSellOrderFragment.q()).f4834s.f6720u.setDisplayValue(String.valueOf(ij.h.a(b11)));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6718s.o();
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6720u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 1:
                if (!((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10366v && !((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10364t) {
                    ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10365u = true;
                    if (type != null && type.length() != 0) {
                        try {
                            ModifyShortSellOrderViewModel modifyShortSellOrderViewModel3 = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                            ij.h hVar2 = ij.h.f20067a;
                            String b12 = ij.h.b((1 - (ij.h.a(type) / 100)) * modifyShortSellOrderViewModel3.f10367w);
                            String b13 = ij.h.b(((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10367w - ij.h.a(b12));
                            ((go) modifyShortSellOrderFragment.q()).f4834s.f6718s.setPrice(Double.valueOf(ij.h.a(b12)));
                            ((go) modifyShortSellOrderFragment.q()).f4834s.f6719t.setDisplayValue(String.valueOf(ij.h.a(b13)));
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6718s.o();
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6719t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 2:
                if (type != null) {
                    ModifyShortSellOrderViewModel modifyShortSellOrderViewModel4 = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                    Intrinsics.checkNotNullParameter(type, "type");
                    modifyShortSellOrderViewModel4.K.postValue(type);
                    return;
                }
                return;
            case 3:
                if (type != null && (g10 = kotlin.text.r.g(type)) != null) {
                    i10 = g10.intValue();
                } else {
                    i10 = 0;
                }
                ModifyShortSellOrderViewModel modifyShortSellOrderViewModel5 = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                modifyShortSellOrderViewModel5.D = i10;
                modifyShortSellOrderViewModel5.I.postValue(Double.valueOf(i10 * modifyShortSellOrderViewModel5.f10367w));
                return;
            case 4:
                if (!((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10363s && !((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10362r) {
                    ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10361q = true;
                    if (type != null && type.length() != 0) {
                        try {
                            ModifyShortSellOrderViewModel modifyShortSellOrderViewModel6 = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                            ij.h hVar3 = ij.h.f20067a;
                            String b14 = ij.h.b(modifyShortSellOrderViewModel6.f10367w + ij.h.a(type));
                            ModifyShortSellOrderViewModel modifyShortSellOrderViewModel7 = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                            double a11 = ij.h.a(b14);
                            double d12 = modifyShortSellOrderViewModel7.f10367w;
                            double d13 = 100;
                            String b15 = ij.h.b(((a11 * d13) / d12) - d13);
                            ((go) modifyShortSellOrderFragment.q()).f4834s.I.setPrice(Double.valueOf(ij.h.a(b14)));
                            ((go) modifyShortSellOrderFragment.q()).f4834s.K.setDisplayValue(String.valueOf(ij.h.a(b15)));
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    ((go) modifyShortSellOrderFragment.q()).f4834s.I.o();
                    ((go) modifyShortSellOrderFragment.q()).f4834s.K.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            default:
                if (!((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10363s && !((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10361q) {
                    ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10362r = true;
                    if (type != null && type.length() != 0) {
                        try {
                            ModifyShortSellOrderViewModel modifyShortSellOrderViewModel8 = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                            ij.h hVar4 = ij.h.f20067a;
                            String b16 = ij.h.b(((ij.h.a(type) / 100) + 1) * modifyShortSellOrderViewModel8.f10367w);
                            String b17 = ij.h.b(ij.h.a(b16) - ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10367w);
                            ((go) modifyShortSellOrderFragment.q()).f4834s.I.setPrice(Double.valueOf(ij.h.a(b16)));
                            ((go) modifyShortSellOrderFragment.q()).f4834s.J.setDisplayValue(String.valueOf(ij.h.a(b17)));
                            return;
                        } catch (Exception unused4) {
                            return;
                        }
                    }
                    ((go) modifyShortSellOrderFragment.q()).f4834s.I.o();
                    ((go) modifyShortSellOrderFragment.q()).f4834s.J.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
        }
    }
}
