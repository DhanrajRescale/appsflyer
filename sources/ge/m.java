package ge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import ba.ym;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.NonStockgroContact;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.i0;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f17324b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, int i10) {
        super(1);
        this.f17323a = i10;
        this.f17324b = oVar;
    }

    public final void a(String searchString) {
        int i10 = this.f17323a;
        o oVar = this.f17324b;
        switch (i10) {
            case 1:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", searchString);
                intent.setType("text/plain");
                oVar.f17327g = intent;
                return;
            default:
                if (searchString != null && searchString.length() > 2) {
                    ((SearchContactViewModel) oVar.r()).j(searchString);
                    SearchContactViewModel searchContactViewModel = (SearchContactViewModel) oVar.r();
                    searchContactViewModel.f9354q = true;
                    searchContactViewModel.f9360w.postValue(Boolean.TRUE);
                    SearchContactViewModel searchContactViewModel2 = (SearchContactViewModel) oVar.r();
                    Intrinsics.checkNotNullParameter(searchString, "searchString");
                    searchContactViewModel2.C = 0;
                    searchContactViewModel2.B = true;
                    searchContactViewModel2.f9361x.clear();
                    searchContactViewModel2.i(searchString);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar;
        boolean z10;
        String phoneNumber;
        int i10 = this.f17323a;
        o oVar = this.f17324b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ProgressBar progressBar = ((ym) oVar.q()).f6752t.f6891t;
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    oVar.F(progressBar);
                } else {
                    ProgressBar progressBar2 = ((ym) oVar.q()).f6752t.f6891t;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                    oVar.t(progressBar2);
                }
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                List list = (List) obj;
                ((SearchContactViewModel) oVar.r()).f9084g.postValue(Boolean.FALSE);
                if (list.isEmpty() && ((SearchContactViewModel) oVar.r()).f9361x.isEmpty()) {
                    k kVar2 = oVar.f17328h;
                    if (kVar2 != null) {
                        kVar2.u(i0.f38321a);
                    }
                    k kVar3 = oVar.f17328h;
                    if (kVar3 != null) {
                        kVar3.d();
                    }
                    RecyclerView inviteContactsList = ((ym) oVar.q()).f6752t.f6890s;
                    Intrinsics.checkNotNullExpressionValue(inviteContactsList, "inviteContactsList");
                    oVar.F(inviteContactsList);
                    ((ym) oVar.q()).f6752t.f27491e.setClickable(false);
                    ((SearchContactViewModel) oVar.r()).B = false;
                } else {
                    int size = ((SearchContactViewModel) oVar.r()).f9361x.size();
                    ((SearchContactViewModel) oVar.r()).f9361x.addAll(list);
                    int size2 = ((SearchContactViewModel) oVar.r()).f9361x.size();
                    k kVar4 = oVar.f17328h;
                    if (kVar4 != null) {
                        kVar4.u(((SearchContactViewModel) oVar.r()).f9361x);
                    }
                    if (size == 0 && size2 > 0) {
                        k kVar5 = oVar.f17328h;
                        if (kVar5 != null) {
                            kVar5.d();
                        }
                    } else if (size > 0 && size2 > size && (kVar = oVar.f17328h) != null) {
                        kVar.f(size - 1, size2 - size);
                    }
                    SearchContactViewModel searchContactViewModel = (SearchContactViewModel) oVar.r();
                    if (((SearchContactViewModel) oVar.r()).f9361x.size() < ((SearchContactViewModel) oVar.r()).D) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    searchContactViewModel.B = z10;
                    if (!((SearchContactViewModel) oVar.r()).f9361x.isEmpty()) {
                        RecyclerView inviteContactsList2 = ((ym) oVar.q()).f6752t.f6890s;
                        Intrinsics.checkNotNullExpressionValue(inviteContactsList2, "inviteContactsList");
                        oVar.F(inviteContactsList2);
                        ((ym) oVar.q()).f6752t.f27491e.setClickable(true);
                    }
                }
                qj.i0 i0Var = oVar.f17329i;
                if (i0Var != null) {
                    i0Var.f32014b = false;
                    return Unit.f23355a;
                }
                Intrinsics.k("scrollListener");
                throw null;
            case 3:
                View view = ((ym) oVar.q()).f6751s.f27491e;
                Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                oVar.t(view);
                return Unit.f23355a;
            case 4:
                r rVar = (r) ((kj.j) obj).a();
                if (rVar != null) {
                    int ordinal = rVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    qe.a aVar = oVar.f17330j;
                                    if (aVar != null) {
                                        aVar.dismiss();
                                    }
                                    oVar.f17330j = null;
                                }
                            } else {
                                qe.a aVar2 = oVar.f17330j;
                                if (aVar2 != null) {
                                    aVar2.dismiss();
                                }
                                oVar.f17330j = null;
                                Context context = oVar.requireContext();
                                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                                Intrinsics.checkNotNullParameter(context, "context");
                                Intrinsics.checkNotNullParameter("Failed to find your friends on Stockgro", "text");
                                Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c("Failed to find your friends on Stockgro", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                            }
                        } else {
                            qe.a aVar3 = oVar.f17330j;
                            if (aVar3 != null) {
                                aVar3.dismiss();
                            }
                            oVar.f17330j = null;
                            Context context2 = oVar.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter("We will add your friends to your friends list", "text");
                            Toast makeText2 = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService2 = context2.getSystemService("layout_inflater");
                            Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            w.k.c("We will add your friends to your friends list", (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                        }
                    } else if (oVar.f17330j == null) {
                        qe.a aVar4 = new qe.a();
                        aVar4.setCancelable(false);
                        aVar4.show(oVar.getParentFragmentManager(), "import-loading");
                        oVar.f17330j = aVar4;
                    }
                }
                return Unit.f23355a;
            case 5:
                Group group = (Group) obj;
                Intrinsics.c(group);
                oVar.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                Intent intent = new Intent(oVar.getContext(), (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                oVar.startActivity(intent);
                return Unit.f23355a;
            case 6:
                a((String) obj);
                return Unit.f23355a;
            case 7:
                StockgroContact contact = (StockgroContact) obj;
                Intrinsics.checkNotNullParameter(contact, "contact");
                ((SearchContactViewModel) oVar.r()).h(contact.getUuid());
                return Unit.f23355a;
            default:
                NonStockgroContact contact2 = (NonStockgroContact) obj;
                Intrinsics.checkNotNullParameter(contact2, "contact");
                String uuid = contact2.getUuid();
                if (uuid != null && uuid.length() != 0) {
                    ((SearchContactViewModel) oVar.r()).h(contact2.getUuid());
                } else if (oVar.f17327g != null) {
                    String phoneNumber2 = contact2.getPhoneNumber();
                    if (phoneNumber2 != null) {
                        if (!kotlin.text.w.s(phoneNumber2, ((SearchContactViewModel) oVar.r()).f9081d.getCountryPrefix(), false)) {
                            phoneNumber = a3.a.f("+91", contact2.getPhoneNumber());
                        } else {
                            phoneNumber = contact2.getPhoneNumber();
                        }
                        String str = "https://wa.me/{" + phoneNumber + "?text=" + ((SearchContactViewModel) oVar.r()).f9363z.getValue();
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(Uri.parse(str));
                        oVar.startActivity(intent2);
                    } else {
                        Context context3 = oVar.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter("There was an issue sending an Invite", "text");
                        Toast makeText3 = Toast.makeText(context3, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService3 = context3.getSystemService("layout_inflater");
                        Intrinsics.d(systemService3, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate3 = ((LayoutInflater) systemService3).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c("There was an issue sending an Invite", (TextView) inflate3.findViewById(R.id.message), makeText3, inflate3);
                    }
                }
                return Unit.f23355a;
        }
    }
}
