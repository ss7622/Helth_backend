package com.example.demo.service;

import com.example.demo.chatgpt.ChatgptApiCall;
import com.example.demo.domain.DietQuestion;
import com.example.demo.domain.User;
import com.example.demo.repository.DietQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DietQuestionService {

    private final DietQuestionRepository dietQuestionRepository;

    @Transactional
    public Long join(DietQuestion dietQuestion){
        DietQuestion saveQuestion = dietQuestionRepository.save(dietQuestion);

        return saveQuestion.getId();
    }

    public String createDiet(DietQuestion dietQuestion){
        return ChatgptApiCall.generateDiet(dietQuestion.getUser());
    }


    //다이어트 퀘스쳔에서 다이어트를 생성한다.

    //다이어트 서비스에서 다이어트를 생성한다.





}