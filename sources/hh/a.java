package hh;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import ba.ar;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityViewModel;
import com.google.android.material.button.MaterialButton;
import ie.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReportEntityActivity f18458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ReportEntityActivity reportEntityActivity, int i10) {
        super(1);
        this.f18457a = i10;
        this.f18458b = reportEntityActivity;
    }

    public final void a(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f18457a;
        boolean z10 = true;
        ReportEntityActivity reportEntityActivity = this.f18458b;
        switch (i10) {
            case 0:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    if (((ReportEntityViewModel) reportEntityActivity.x()).f10017u) {
                        ReportEntityViewModel reportEntityViewModel = (ReportEntityViewModel) reportEntityActivity.x();
                        String str = ((ReportEntityViewModel) reportEntityActivity.x()).f10014r;
                        reportEntityViewModel.f9084g.postValue(Boolean.TRUE);
                        nt.h c10 = reportEntityViewModel.f10010n.blockUserOnPrivateChat(true, str).c(((kq.e) reportEntityViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new vg.d(15, new ja.g(reportEntityViewModel, z10, 5)), new vg.d(16, new g(reportEntityViewModel, 0)));
                        c10.a(dVar);
                        reportEntityViewModel.f9080c.c(dVar);
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("BLOCKED", false);
                    reportEntityActivity.setResult(-1, intent);
                    reportEntityActivity.finish();
                    return;
                }
                return;
            case 1:
                Intent intent2 = new Intent();
                intent2.putExtra("BLOCKED", true);
                reportEntityActivity.setResult(-1, intent2);
                reportEntityActivity.finish();
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = reportEntityActivity.f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = reportEntityActivity.f17255c) != null) {
                    fVar.b();
                    return;
                }
                return;
        }
    }

    public final void d(String it) {
        View view;
        TextView textView;
        MaterialButton materialButton;
        MaterialButton materialButton2 = null;
        int i10 = this.f18457a;
        ReportEntityActivity reportEntityActivity = this.f18458b;
        switch (i10) {
            case 3:
                Intrinsics.c(it);
                int i11 = ReportEntityActivity.f10008l;
                reportEntityActivity.getClass();
                LayoutInflater from = LayoutInflater.from(reportEntityActivity);
                int i12 = ar.f4226u;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                ar arVar = (ar) m.g(from, R.layout.layout_custom_dialog_single_choice, null, false, null);
                h.j create = new h.i(reportEntityActivity, R.style.StockgroDialogTheme).create();
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                if (arVar != null) {
                    view = arVar.f27491e;
                } else {
                    view = null;
                }
                h.h hVar = create.f17699f;
                hVar.f17674h = view;
                hVar.f17675i = 0;
                hVar.f17676j = false;
                int i13 = 1;
                create.setCancelable(true);
                create.setCanceledOnTouchOutside(false);
                Window window = create.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                create.show();
                if (arVar != null) {
                    textView = arVar.f4228t;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    textView.setText(it);
                }
                if (arVar != null) {
                    materialButton2 = arVar.f4227s;
                }
                if (materialButton2 != null) {
                    materialButton2.setText(reportEntityActivity.getString(R.string.ok));
                }
                if (arVar != null && (materialButton = arVar.f4227s) != null) {
                    materialButton.setOnClickListener(new p(create, i13));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ReportEntityViewModel reportEntityViewModel = (ReportEntityViewModel) reportEntityActivity.x();
                String string = reportEntityActivity.getString(R.string.others_capital_text);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ReportEntityViewModel.h(reportEntityViewModel, string, null, it, 2);
                reportEntityActivity.setResult(-1);
                reportEntityActivity.finish();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f18457a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                d((String) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
