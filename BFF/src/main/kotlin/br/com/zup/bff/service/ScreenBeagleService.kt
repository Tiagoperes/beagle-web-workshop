package br.com.zup.bff.service

import br.com.zup.bff.builder.default.ScreenForm
import br.com.zup.bff.builder.default.ScreenConfirm
import br.com.zup.bff.builder.default.ScreenSuccess
import br.com.zup.bff.builder.custom.ScreenFormCustom
import br.com.zup.bff.builder.custom.ScreenConfirmCustom
import br.com.zup.bff.builder.custom.ScreenSuccessCustom
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
  fun createScreenForm() = ScreenForm
  fun createScreenConfirm() = ScreenConfirm
  fun createScreenSuccess() = ScreenSuccess

  fun createScreenFormCustom() = ScreenFormCustom
  fun createScreenConfirmCustom() = ScreenConfirmCustom
  fun createScreenSuccessCustom() = ScreenSuccessCustom
}