package com.webengage.sdk.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class q {

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12641a;

        static {
            int[] iArr = new int[j0.values().length];
            f12641a = iArr;
            try {
                iArr[j0.f12597a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12641a[j0.f12598b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12641a[j0.f12599c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12641a[j0.f12602f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12641a[j0.f12601e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12641a[j0.f12603g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12641a[j0.f12604h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12641a[j0.f12606j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12641a[j0.f12600d.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12641a[j0.f12607k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12641a[j0.f12605i.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12641a[j0.f12609m.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12641a[j0.f12608l.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12641a[j0.f12611o.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12641a[j0.f12610n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Intent a(j0 j0Var, Object obj, Context context) {
        Serializable serializable;
        Serializable serializable2;
        Intent intent = new Intent();
        intent.putExtra("topic", j0Var);
        switch (a.f12641a[j0Var.ordinal()]) {
            case 1:
            case 9:
            case 12:
            case 13:
            case 14:
                intent.setClass(context, ExecutorService.class);
                break;
            case 2:
            case 7:
                serializable = (n) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
            case 3:
                intent.putExtra("data", (Bundle) obj);
                intent.setClass(context, ExecutorService.class);
                break;
            case 4:
                intent.putExtra("data", (Intent) obj);
                intent.setClass(context, ExecutorService.class);
                break;
            case 5:
                intent.setClass(context, EventLogService.class);
                serializable2 = (ArrayList) obj;
                intent.putExtra("data", serializable2);
                break;
            case 6:
                intent.setClass(context, ExecutorService.class);
                serializable2 = (Exception) obj;
                intent.putExtra("data", serializable2);
                break;
            case 8:
                serializable = (g0) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
            case 10:
            case 15:
                serializable = (ArrayList) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
            case 11:
                serializable = (HashMap) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
        }
        return intent;
    }
}
