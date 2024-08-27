package kj;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.prod.R;
import el.l;
import h.m;
import ij.n;
import in.juspay.hyper.constants.Labels;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f23222a;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23222a = new i(context);
    }

    public final void a(Context context, n listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("android.permission.WRITE_EXTERNAL_STORAGE", Labels.System.PERMISSION);
        Intrinsics.checkNotNullParameter(listener, "listener");
        int checkSelfPermission = r3.k.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        Context context2 = listener.f20082c;
        int i10 = listener.f20080a;
        if (checkSelfPermission != 0) {
            boolean b10 = q3.h.b((m) context, "android.permission.WRITE_EXTERNAL_STORAGE");
            Activity activity = listener.f20081b;
            if (b10) {
                switch (i10) {
                    case 0:
                        q3.h.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                        return;
                    default:
                        q3.h.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                        return;
                }
            }
            i iVar = this.f23222a;
            if (iVar.f23225a.getBoolean("android.permission.WRITE_EXTERNAL_STORAGE", true)) {
                if (iVar.f23226b == null) {
                    iVar.f23226b = iVar.f23225a.edit();
                }
                SharedPreferences.Editor editor = iVar.f23226b;
                Intrinsics.c(editor);
                editor.putBoolean("android.permission.WRITE_EXTERNAL_STORAGE", false);
                SharedPreferences.Editor editor2 = iVar.f23226b;
                if (editor2 != null) {
                    editor2.commit();
                    iVar.f23226b = null;
                }
                switch (i10) {
                    case 0:
                        q3.h.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                        return;
                    default:
                        q3.h.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                        return;
                }
            }
            switch (i10) {
                case 0:
                    String text = context2.getString(R.string.dont_ask_again_condition);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context2.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        return;
                    }
                    return;
                default:
                    String text2 = context2.getString(R.string.dont_ask_again_condition);
                    Intrinsics.checkNotNullExpressionValue(text2, "getString(...)");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(text2, "text");
                    if (text2.length() != 0) {
                        Toast makeText2 = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService2 = context2.getSystemService("layout_inflater");
                        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                        return;
                    }
                    return;
            }
        }
        String str = listener.f20083d;
        String str2 = listener.f20084e;
        switch (i10) {
            case 0:
                l.K(context2, str, "File Desc", str2);
                return;
            default:
                l.K(context2, str, "File Desc", str2);
                return;
        }
    }
}
