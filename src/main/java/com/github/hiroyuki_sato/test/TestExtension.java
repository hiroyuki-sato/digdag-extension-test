package com.github.hiroyuki_sato.test;

import com.google.inject.Module;
import com.google.inject.Binder;
import com.google.inject.Scopes;
import com.google.inject.multibindings.Multibinder;
import io.digdag.spi.Extension;

import java.util.Arrays;
import java.util.List;

public class TestExtension implements Extension
{
    @Override
    public List<Module> getModules(){
        return Arrays.asList(new TestModule());
    }

    public static class TestModule implements Module
    {
        @Override
        public void configure(Binder binder)
        {
        }
    }

}
